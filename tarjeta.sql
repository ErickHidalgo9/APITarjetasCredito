PGDMP     8    '                z            tarjeta    14.1    14.1 
    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16490    tarjeta    DATABASE     d   CREATE DATABASE tarjeta WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE tarjeta;
                postgres    false                        2615    16491    tarjeta    SCHEMA        CREATE SCHEMA tarjeta;
    DROP SCHEMA tarjeta;
                postgres    false            ?            1259    16500    tarjetas    TABLE     ?  CREATE TABLE tarjeta.tarjetas (
    id bigint NOT NULL,
    edad_maxima integer NOT NULL,
    edad_minima integer NOT NULL,
    fecha_creacion timestamp without time zone NOT NULL,
    fecha_modificacion timestamp without time zone,
    preferencia character varying(60) NOT NULL,
    salario_maximo double precision NOT NULL,
    salario_minimo double precision NOT NULL,
    tarjeta_credito character varying(80) NOT NULL,
    usuario_creacion character varying(255) NOT NULL
);
    DROP TABLE tarjeta.tarjetas;
       tarjeta         heap    postgres    false    4            ?            1259    16499    tarjetas_id_seq    SEQUENCE     ?   ALTER TABLE tarjeta.tarjetas ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME tarjeta.tarjetas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            tarjeta          postgres    false    211    4            ?          0    16500    tarjetas 
   TABLE DATA           ?   COPY tarjeta.tarjetas (id, edad_maxima, edad_minima, fecha_creacion, fecha_modificacion, preferencia, salario_maximo, salario_minimo, tarjeta_credito, usuario_creacion) FROM stdin;
    tarjeta          postgres    false    211          ?           0    0    tarjetas_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('tarjeta.tarjetas_id_seq', 76, true);
          tarjeta          postgres    false    210            ^           2606    16504    tarjetas tarjetas_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY tarjeta.tarjetas
    ADD CONSTRAINT tarjetas_pkey PRIMARY KEY (id);
 A   ALTER TABLE ONLY tarjeta.tarjetas DROP CONSTRAINT tarjetas_pkey;
       tarjeta            postgres    false    211            ?   ?  x???=s?H?k?W???????Nv?w.??,?aF3?9??Ò{i9?.?|?/ T???h?/???M\ٸ???5Տ??~???+cSJU?ZW??n???]s?T??n?l???*?K?
SX?w?ax?X?V?(?N??m?c?ؼc??1Ay#a?̼?B??I???S???_??}?^?X?K?????;%J?ʘ պ=??鵾m?ͮ?X??+?U$?𼇟m???-r4???hH9.?`t??8????9??^+cx?U9|?H0$?$/6?8?4(a\PΈn;h,$?G??$x????!???%?aIÑf?C?s`??b0?7???C4\iP0wuI?~(Kϙg??0\?h??NaLb<??@K4?:??Q[`$????'??'Z?E%??.?՟G?S&?U}^?ynY?????x?h?(?E???IJ?=?P? ?W???q?H??,f??8?Ƒ?yk? @֪d???q??%?i1?4J??m3t?Ӯ ???k?H?.D?W?%??Q?dok1(Yh%??*?gOI?t???'?Ж?83@z?Se&#d??D?F?\e????&&/):??HF&1??B~ȝ;??5??c#????n??\?7/?~h?ۂ??0%N[ϙ7??E??A<G2???<?`?b?|K޲p??l?!??+@3G???? ??
???S<?ģwaK?ɓ ??I?????X?Mn| ?B?j?4?KP&??j?6m???????iJؤ??<??m;??????x???????$?c?|??o??Ǯ/QVo?E"?\??$??g????+?v-?%?d?#???C?9ns	?o???7玼?iw???? ?]?ky??k??y?k??u????+?$fwZ?8??i????n?IIND>?ۓ?????????_?æ??w|???.?7j!?iM??????:6???f?VƏ-#uv???e????mdZ???s\gT??J?k?????c????K?G??r??3???1ߢ&????A1?Μ?\?gv?x?#Tަt?Z5??%????3LR???w?5?%???'?????̉4?$?X`N?	?e?ڠsBg????|?s9O ?%$??옳y?????룲|?1??cZL?e??o?%5s?,ϳl?q?l??uss???:?C     