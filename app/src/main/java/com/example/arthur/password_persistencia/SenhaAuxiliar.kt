package com.example.arthur.password_persistencia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SenhaAuxiliar (context: Context, resource: Int, objects: List<Password>) :
    ArrayAuxiliar<Password>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val convertView =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.activity_lista_senhas, parent, false)

        val descricaoTextView: TextView = convertView.findViewById(R.id.descricaoDaSenhaLista)
        val tamanhoTextView: TextView = convertView.findViewById(R.id.tamanhoDaSenhaLista)

        val senha = getItem(position)
        descricaoTextView.text = senha?.descricao
        tamanhoTextView.text = "(${senha?.verificarTamanho()})"
        return convertView
    }
}