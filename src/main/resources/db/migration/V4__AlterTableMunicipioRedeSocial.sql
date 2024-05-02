ALTER TABLE IF EXISTS public.municipio_rede_social
        ADD CONSTRAINT fk_rede_social_id FOREIGN KEY (rede_social_id)
        REFERENCES public.rede_social (id_rede_social) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;

ALTER TABLE IF EXISTS public.municipio_rede_social
    ADD CONSTRAINT fk_municipio_id FOREIGN KEY (municipio_id)
        REFERENCES public.municipio (id_municipio) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;