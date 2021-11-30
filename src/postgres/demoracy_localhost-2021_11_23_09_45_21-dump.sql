toc.dat                                                                                             0000600 0004000 0002000 00000011054 14151510121 0014427 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP       4    9            
    y         	   democracy    14.0    14.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                     1262    16394 	   democracy    DATABASE     m   CREATE DATABASE democracy WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE democracy;
                postgres    false                    0    0    DATABASE democracy    COMMENT     0   COMMENT ON DATABASE democracy IS 'for SE proj';
                   postgres    false    3328         �            1259    16412 
   candidates    TABLE     �   CREATE TABLE public.candidates (
    candidateid integer NOT NULL,
    name character varying[] NOT NULL,
    description character varying
);
    DROP TABLE public.candidates;
       public         heap    postgres    false         �            1259    16426    users    TABLE     x   CREATE TABLE public.users (
    userid integer NOT NULL,
    name character varying NOT NULL,
    studentnum integer
);
    DROP TABLE public.users;
       public         heap    postgres    false         �            1259    16419    votes    TABLE     �   CREATE TABLE public.votes (
    votenum integer NOT NULL,
    vote1 integer,
    vote2 integer,
    vote3 integer,
    vote4 integer,
    vote5 integer,
    fptpvote integer NOT NULL,
    userid integer NOT NULL
);
    DROP TABLE public.votes;
       public         heap    postgres    false         �          0    16412 
   candidates 
   TABLE DATA           D   COPY public.candidates (candidateid, name, description) FROM stdin;
    public          postgres    false    209       3320.dat �          0    16426    users 
   TABLE DATA           9   COPY public.users (userid, name, studentnum) FROM stdin;
    public          postgres    false    211       3322.dat �          0    16419    votes 
   TABLE DATA           ]   COPY public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) FROM stdin;
    public          postgres    false    210       3321.dat d           2606    16418    candidates candidates_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT candidates_pkey PRIMARY KEY (candidateid);
 D   ALTER TABLE ONLY public.candidates DROP CONSTRAINT candidates_pkey;
       public            postgres    false    209         i           2606    16435    users users_pk 
   CONSTRAINT     P   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pk PRIMARY KEY (userid);
 8   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pk;
       public            postgres    false    211         f           2606    16425    votes voteNum 
   CONSTRAINT     R   ALTER TABLE ONLY public.votes
    ADD CONSTRAINT "voteNum" PRIMARY KEY (votenum);
 9   ALTER TABLE ONLY public.votes DROP CONSTRAINT "voteNum";
       public            postgres    false    210         j           1259    16436    users_studentnum_uindex    INDEX     V   CREATE UNIQUE INDEX users_studentnum_uindex ON public.users USING btree (studentnum);
 +   DROP INDEX public.users_studentnum_uindex;
       public            postgres    false    211         k           1259    16432    users_userid_uindex    INDEX     N   CREATE UNIQUE INDEX users_userid_uindex ON public.users USING btree (userid);
 '   DROP INDEX public.users_userid_uindex;
       public            postgres    false    211         g           1259    16437    votes_userid_uindex    INDEX     N   CREATE UNIQUE INDEX votes_userid_uindex ON public.votes USING btree (userid);
 '   DROP INDEX public.votes_userid_uindex;
       public            postgres    false    210         l           2606    16443    votes votes_users_studentnum_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.votes
    ADD CONSTRAINT votes_users_studentnum_fk FOREIGN KEY (userid) REFERENCES public.users(studentnum);
 I   ALTER TABLE ONLY public.votes DROP CONSTRAINT votes_users_studentnum_fk;
       public          postgres    false    210    211    3178                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            3320.dat                                                                                            0000600 0004000 0002000 00000000705 14151510121 0014232 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        4	{"Doctor Octavius"}	I want to make Osborn pay for running my name through the mud!
5	{Mysterio}	I wanna make Spider-Man go mad and maybe the city next. *Evil Laugther* 
2	{Venom}	Screw the rules!
3	{"J. Jonah Jameson"}	I wanna make the streets free of villany and crime for all of New York. By takting the root of the problem out which is of course Spider-Man
1	{Spider-Man}	I wanna make the streets free of villany and crime for all of New York
\.


                                                           3322.dat                                                                                            0000600 0004000 0002000 00000001210 14151510121 0014224 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Ansleigh Bailie	1377
2	Landan Colby	9638
3	Randal Woodie	8398
4	Lovell Dempsey	2436
5	Arik Severin	1128
6	Stephon Devyn	5600
7	Auden Silas	3357
8	Bert Robin	6619
9	Geoffrey Whittaker	1280
10	Meryl Lyndsey	7888
11	Reid Chip	7192
12	Russell Brooks	782
13	Cody Austyn	9102
14	Leigh Alison	4228
15	Nicol Hallie	5891
16	Cassie Fred	8760
17	Farryn Jeremie	7756
18	Camelia Merlyn	1438
19	Rae Sandy	520
20	Faye Easter	3998
21	Elmira Karan	7993
22	Cole Harmony	1370
23	Lilibeth Taylor	2948
24	Karina Ashton	7630
25	Leeanne Amberlyn	7741
26	Jaeda Della	1236
27	Joy Leeann	6374
28	Beverly Constance	7973
29	Winnie Kaylynn	2735
30	Elizabeth Lowery	4362
\.


                                                                                                                                                                                                                                                                                                                                                                                        3321.dat                                                                                            0000600 0004000 0002000 00000001122 14151510121 0014225 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	1	3	2	5	4	1	1377
2	3	4	5	2	1	3	9638
3	1	2	3	5	4	1	8398
4	5	2	1	4	3	5	2436
5	4	1	2	5	3	4	1128
6	2	4	3	5	1	2	5600
7	5	3	4	2	1	5	3357
8	2	4	3	5	1	2	6619
9	3	4	2	1	5	3	1280
10	2	3	4	1	5	2	7888
11	4	3	1	5	2	4	7192
12	5	2	4	1	3	5	782
13	4	2	5	3	1	4	9102
14	5	4	3	1	2	5	4228
26	5	1	4	2	3	4	1236
25	3	2	5	4	1	5	7741
22	3	1	2	4	5	2	1370
28	2	3	5	1	4	5	7973
19	1	3	4	5	2	4	520
18	3	4	5	1	2	5	1438
27	5	2	1	3	4	1	6374
16	2	1	4	3	5	4	8760
17	5	2	3	1	4	3	7756
20	2	1	5	4	3	5	3998
21	2	5	3	1	4	3	7993
15	5	3	4	1	2	4	5891
24	4	2	1	5	3	1	7630
30	3	2	1	5	4	1	4362
23	4	3	1	5	2	1	2948
29	1	4	2	5	3	2	2735
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                              restore.sql                                                                                         0000600 0004000 0002000 00000010300 14151510121 0015345 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 14.0
-- Dumped by pg_dump version 14.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE democracy;
--
-- Name: democracy; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE democracy WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';


ALTER DATABASE democracy OWNER TO postgres;

\connect democracy

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: DATABASE democracy; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE democracy IS 'for SE proj';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: candidates; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidates (
    candidateid integer NOT NULL,
    name character varying[] NOT NULL,
    description character varying
);


ALTER TABLE public.candidates OWNER TO postgres;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    userid integer NOT NULL,
    name character varying NOT NULL,
    studentnum integer
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: votes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.votes (
    votenum integer NOT NULL,
    vote1 integer,
    vote2 integer,
    vote3 integer,
    vote4 integer,
    vote5 integer,
    fptpvote integer NOT NULL,
    userid integer NOT NULL
);


ALTER TABLE public.votes OWNER TO postgres;

--
-- Data for Name: candidates; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidates (candidateid, name, description) FROM stdin;
\.
COPY public.candidates (candidateid, name, description) FROM '$$PATH$$/3320.dat';

--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (userid, name, studentnum) FROM stdin;
\.
COPY public.users (userid, name, studentnum) FROM '$$PATH$$/3322.dat';

--
-- Data for Name: votes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) FROM stdin;
\.
COPY public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) FROM '$$PATH$$/3321.dat';

--
-- Name: candidates candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT candidates_pkey PRIMARY KEY (candidateid);


--
-- Name: users users_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pk PRIMARY KEY (userid);


--
-- Name: votes voteNum; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.votes
    ADD CONSTRAINT "voteNum" PRIMARY KEY (votenum);


--
-- Name: users_studentnum_uindex; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX users_studentnum_uindex ON public.users USING btree (studentnum);


--
-- Name: users_userid_uindex; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX users_userid_uindex ON public.users USING btree (userid);


--
-- Name: votes_userid_uindex; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX votes_userid_uindex ON public.votes USING btree (userid);


--
-- Name: votes votes_users_studentnum_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.votes
    ADD CONSTRAINT votes_users_studentnum_fk FOREIGN KEY (userid) REFERENCES public.users(studentnum);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                