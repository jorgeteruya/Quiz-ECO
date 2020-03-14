/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztest;

/**
 *
 * @author jteruya
 */
public class QuestAgua extends Questionario{
    
    private String p1, p2, p3;
    private Alternativa[] a1, a2, a3;
    
    public QuestAgua() {

       this.categoria = "agua";
       
        // ÁGUA
        getPerguntas();
        newQuest(p1, a1);
        newQuest(p2, a2);
        newQuest(p3, a3);        
        
    }
    public void getPerguntas(){
        //pergunta 1
        p1 = "“A DEGRADAÇÃO DOS MANANCIAIS, PROVENIENTE DO DEFLÚVIO SUPERFICIAL AGRÍCOLA,"
                + "\n OCORRE, PRINCIPALMENTE, DEVIDO AO AUMENTO DA ATIVIDADE PRIMÁRIA DAS PLANTAS E"
                + "\n ALGAS EM DECORRÊNCIA DO APORTE DE NITROGÊNIO E FÓSFORO PROVENIENTE DAS"
                + "\n LAVOURAS E DA PRODUÇÃO ANIMAL EM REGIME CONFINADO. O CRESCIMENTO EXCESSIVO DE"
                + "\n ALGAS E PLANTAS REDUZ A DISPONIBILIDADE DE OXIGÊNIO DISSOLVIDO NAS ÁGUAS,"
                + "\n AFETANDO ADVERSAMENTE O ECOSSISTEMA AQUÁTICO E CAUSANDO, ALGUMAS VEZES,"
                + "\n MORTALIDADE DE PEIXES. ALÉM DOS IMPACTOS CAUSADOS AOS ECOSSISTEMAS AQUÁTICOS,"
                + "\n O AUMENTO DOS NÍVEIS DE NUTRIENTES NA ÁGUA PODE COMPROMETER SUA UTILIZAÇÃO "
                + "\n PARA ABASTECIMENTO DOMÉSTICO, DEVIDO A ALTERAÇÕES NO SABOR E ODOR"
                + "\n DA ÁGUA OU À PRESENÇA DE TOXINAS LIBERADAS PELA FLORAÇÃO DE ALGUNS TIPOS DE"
                + "\n ALGAS. ALÉM DAS IMPLICAÇÕES CAUSADAS PELOS NUTRIENTES AOS RECURSOS HÍDRICOS, É"
                + "\n NECESSÁRIO CONSIDERAR, TAMBÉM, A CONTRIBUIÇÃO DOS AGROQUÍMICOS E DOS METAIS PESADOS."
                + "\n PERGUNTA: Referente a utilização dos mananciais, para um consumo mais econômico e sustentável para indústria agrícola seria: ";
        Alternativa[] a1 = {new Alternativa("imagem 1", "CERTO - Ao escovar os dentes por alguns"
                                        + "\n minutos com a água escoando, são gastos 12 litros de água. Sendo que enquanto você apenas"
                                        + "\n utiliza a torneira para enxaguar e limpar a escova você faz o uso em média de apenas"
                                        + "\n meio litro."),
                            new Alternativa("Reutilizar águas de outras mananciais. ", "ERRRADO - Isso apenas aumentaria o consumo"
                                                        + "\n e com tempo geraram secas, o que contradiz uma ideia sustentável "),
                            new Alternativa("Aumentar o índice de produção dos alimentos da indústria Agropecuária e Agrícola para"
                                                        + "\n diminuir o uso da água. ", "ERRRADO - Só a Pecuária para produzir 1KG de carne "
                                                        + "\n bovina são gastos mais de 15.400 litros de água. No Brasil cerca "
                                                        + "\n de 70% do consumo de água vem apenas da indústria agrícola. ")};
        this.a1 = a1;
        
        //Pergunta 2 Água
        p2 = "“QUANDO FALAMOS EM DESPERDÍCIO, GERALMENTE O DESTAQUE VAI PARA AQUELE PRODUZIDO PELA"
                + "\n POPULAÇÃO, SOBRETUDO NO USO RESIDENCIAL. OS EXEMPLOS SÃO VÁRIOS, TAIS COMO ESCOVAR OS "
                + "\n DENTES COM A TORNEIRA ABERTA, USAR MUITA ÁGUA PARA LAVAR CALÇADAS E VEÍCULOS, DEIXAR A"
                + "\n TORNEIRA PINGANDO, NÃO CONTER VAZAMENTOS EM CASAS E PRÉDIOS, TOMAR BANHOS DEMORADOS,"
                + "\n ETC. TUDO ISSO, SEM DÚVIDAS, CONTRIBUI PARA O AUMENTO DO DESPERDÍCIO DE ÁGUA, MAS"
                + "\n EXISTEM OUTRAS FORMAS AINDA MAIS GRAVES QUE TORNAM O PROBLEMA UMA QUESTÃON"
                + "\n INTERNACIONAL RELATIVA À DISPONIBILIDADE DE RECURSOS HÍDRICOS."
                + "\n PERGUNTA: COM BASE NOS FATOS A CIMA, QUAL DAS IMAGENS A BAIXO APRESENTA UM BOM USO SUSTENTÁVEL:";
        
        Alternativa[] a2 = {new Alternativa("imagem 1", "CERTO - Ao escovar os dentes por alguns"
                                        + "\n minutos com a água escoando, são gastos 12 litros de água. Sendo que enquanto você apenas"
                                        + "\n utiliza a torneira para enxaguar e limpar a escova você faz o uso em média de apenas"
                                        + "\n meio litro."), 
                            new Alternativa("imagem 2", "ERRRADO -Ficar muito tempo em um chuveiro gera em cerca"
                                        + "\n 135 litros de água usada. Ter hábitos de fazer outras coisas no banho, eleva muito "
                                        + "\n o desperdício da água. Enquanto um bom uso de apenas 5 minutos de banho gera em torno de"
                                        + "\n 45 litros, disprediçando o menor índice possível de água no mundo."),
                            new Alternativa("imagem 3", "ERRRADO -Uma torneira apenas gotejando gasta em cerca  46"
                                        + "\n litros de água por dia ou quando pouco aberta, gasta cerca de 180 a 750 litros por dia."
                                        + "\n Sempre que ver uma torneira aberta ou mal fechada, o correto é sempre FECHA-LA")};
        this.a2 = a2;
        

        //Pergunta 3 Água
        p3 = "A água doce é um recurso natural finito, cuja qualidade vem piorando devido ao"
                                + "\n aumento da população e à ausência de políticas públicas voltadas para a sua preservação."
                                + "\n Estima-se que aproximadamente doze milhões de pessoas morrem"
                                + "\n anualmente por problemas relacionados com a qualidade da água. No Brasil, esse"
                                + "\n problema não é diferente, uma vez que os registros do Sistema Único de Saúde (SUS)"
                                + "\n mostram que 80% das internações hospitalares do país são devidas a doenças de"
                                + "\n veiculação hídrica, ou seja, doenças que ocorrem devido à qualidade imprópria da água"
                                + "\n para consumo humano."
                     + "\n\n PERGUNTA: Seja o Saneamento básico um direito fundamental para o desenvolvimento da"
                     + "\n cidadania, liste a alternativa que não apresenta o quesito Saneamento Básico: ";
        
        Alternativa[] a3 = {new Alternativa("Resíduos Sólidos não tratado", "Os resíduos sólidos são tratados"
                                                    + "\n como são definidos como sendo todo material, substância, objeto ou "
                                                    + "\n bem descartado resultante de atividades humanas em sociedade."
                                                    + "\n Por isso ele não estando tratado faz com que ele não esteja apresentando o Saneamento básico"),
                            new Alternativa("Universalização do acesso ao saneamento, prestação dos serviços de forma adequada"
                                                    + "\n à saúde pública e à proteção do meio ambiente, à segurança da vida e do"
                                                    + "\n patrimônio público e privado, habilitando a cobrança de tributos. ", "O serviço deverá ser efetivamente acessado e usufruído por "
                                                            + "\n toda sociedade, oferecendo salubridade ambiental e condições de saúde "
                                                            + "\n para os cidadãos e serviços de abastecimento de água, esgotamento sanitário, limpeza urbana, "
                                                            + "\n manejo dos resíduos sólidos e serviços de drenagem e de manejo das águas pluviais."),
                            new Alternativa("Segurança, qualidade e regularidade", "Por segurança e qualidade, "
                                                    + "\n entenda-se a eficiência da prestação do serviço e o respeito "
                                                    + "\n à incolumidade dos consumidores e, por regularidade, a prestação ininterrupta.")};
        this.a3 = a3;
    }
    

    
}
