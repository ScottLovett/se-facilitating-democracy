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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: description; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.description (
    candidateid integer NOT NULL,
    name character varying[] NOT NULL,
    description character varying
);


ALTER TABLE public.description OWNER TO postgres;

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
-- Data for Name: description; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.description (candidateid, name, description) VALUES (4, '{"Doctor Octavius"}', 'I want to make Osborn pay for running my name through the mud!');
INSERT INTO public.description (candidateid, name, description) VALUES (5, '{Mysterio}', 'I wanna make Spider-Man go mad and maybe the city next. *Evil Laugther* ');
INSERT INTO public.description (candidateid, name, description) VALUES (2, '{Venom}', 'Screw the rules!');
INSERT INTO public.description (candidateid, name, description) VALUES (3, '{"J. Jonah Jameson"}', 'I wanna make the streets free of villany and crime for all of New York. By takting the root of the problem out which is of course Spider-Man');
INSERT INTO public.description (candidateid, name, description) VALUES (1, '{Spider-Man}', 'I wanna make the streets free of villany and crime for all of New York');


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.users (userid, name, studentnum) VALUES (1, 'Ansleigh Bailie', 1377);
INSERT INTO public.users (userid, name, studentnum) VALUES (2, 'Landan Colby', 9638);
INSERT INTO public.users (userid, name, studentnum) VALUES (3, 'Randal Woodie', 8398);
INSERT INTO public.users (userid, name, studentnum) VALUES (4, 'Lovell Dempsey', 2436);
INSERT INTO public.users (userid, name, studentnum) VALUES (5, 'Arik Severin', 1128);
INSERT INTO public.users (userid, name, studentnum) VALUES (6, 'Stephon Devyn', 5600);
INSERT INTO public.users (userid, name, studentnum) VALUES (7, 'Auden Silas', 3357);
INSERT INTO public.users (userid, name, studentnum) VALUES (8, 'Bert Robin', 6619);
INSERT INTO public.users (userid, name, studentnum) VALUES (9, 'Geoffrey Whittaker', 1280);
INSERT INTO public.users (userid, name, studentnum) VALUES (10, 'Meryl Lyndsey', 7888);
INSERT INTO public.users (userid, name, studentnum) VALUES (11, 'Reid Chip', 7192);
INSERT INTO public.users (userid, name, studentnum) VALUES (12, 'Russell Brooks', 782);
INSERT INTO public.users (userid, name, studentnum) VALUES (13, 'Cody Austyn', 9102);
INSERT INTO public.users (userid, name, studentnum) VALUES (14, 'Leigh Alison', 4228);
INSERT INTO public.users (userid, name, studentnum) VALUES (15, 'Nicol Hallie', 5891);
INSERT INTO public.users (userid, name, studentnum) VALUES (16, 'Cassie Fred', 8760);
INSERT INTO public.users (userid, name, studentnum) VALUES (17, 'Farryn Jeremie', 7756);
INSERT INTO public.users (userid, name, studentnum) VALUES (18, 'Camelia Merlyn', 1438);
INSERT INTO public.users (userid, name, studentnum) VALUES (19, 'Rae Sandy', 520);
INSERT INTO public.users (userid, name, studentnum) VALUES (20, 'Faye Easter', 3998);
INSERT INTO public.users (userid, name, studentnum) VALUES (21, 'Elmira Karan', 7993);
INSERT INTO public.users (userid, name, studentnum) VALUES (22, 'Cole Harmony', 1370);
INSERT INTO public.users (userid, name, studentnum) VALUES (23, 'Lilibeth Taylor', 2948);
INSERT INTO public.users (userid, name, studentnum) VALUES (24, 'Karina Ashton', 7630);
INSERT INTO public.users (userid, name, studentnum) VALUES (25, 'Leeanne Amberlyn', 7741);
INSERT INTO public.users (userid, name, studentnum) VALUES (26, 'Jaeda Della', 1236);
INSERT INTO public.users (userid, name, studentnum) VALUES (27, 'Joy Leeann', 6374);
INSERT INTO public.users (userid, name, studentnum) VALUES (28, 'Beverly Constance', 7973);
INSERT INTO public.users (userid, name, studentnum) VALUES (29, 'Winnie Kaylynn', 2735);
INSERT INTO public.users (userid, name, studentnum) VALUES (30, 'Elizabeth Lowery', 4362);


--
-- Data for Name: votes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (1, 1, 3, 2, 5, 4, 1, 1377);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (2, 3, 4, 5, 2, 1, 3, 9638);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (3, 1, 2, 3, 5, 4, 1, 8398);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (4, 5, 2, 1, 4, 3, 5, 2436);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (5, 4, 1, 2, 5, 3, 4, 1128);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (6, 2, 4, 3, 5, 1, 2, 5600);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (7, 5, 3, 4, 2, 1, 5, 3357);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (8, 2, 4, 3, 5, 1, 2, 6619);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (9, 3, 4, 2, 1, 5, 3, 1280);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (10, 2, 3, 4, 1, 5, 2, 7888);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (11, 4, 3, 1, 5, 2, 4, 7192);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (12, 5, 2, 4, 1, 3, 5, 782);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (13, 4, 2, 5, 3, 1, 4, 9102);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (14, 5, 4, 3, 1, 2, 5, 4228);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (26, 5, 1, 4, 2, 3, 4, 1236);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (25, 3, 2, 5, 4, 1, 5, 7741);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (22, 3, 1, 2, 4, 5, 2, 1370);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (28, 2, 3, 5, 1, 4, 5, 7973);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (19, 1, 3, 4, 5, 2, 4, 520);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (18, 3, 4, 5, 1, 2, 5, 1438);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (27, 5, 2, 1, 3, 4, 1, 6374);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (16, 2, 1, 4, 3, 5, 4, 8760);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (17, 5, 2, 3, 1, 4, 3, 7756);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (20, 2, 1, 5, 4, 3, 5, 3998);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (21, 2, 5, 3, 1, 4, 3, 7993);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (15, 5, 3, 4, 1, 2, 4, 5891);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (24, 4, 2, 1, 5, 3, 1, 7630);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (30, 3, 2, 1, 5, 4, 1, 4362);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (23, 4, 3, 1, 5, 2, 1, 2948);
INSERT INTO public.votes (votenum, vote1, vote2, vote3, vote4, vote5, fptpvote, userid) VALUES (29, 1, 4, 2, 5, 3, 2, 2735);


--
-- Name: description candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.description
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

