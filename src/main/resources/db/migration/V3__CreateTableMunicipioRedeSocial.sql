CREATE TABLE IF NOT EXISTS public.municipio_rede_social
(
    id_municipio_rede_social uuid NOT NULL,
    municipio_id uuid NOT NULL,
    rede_social_id bigint NOT NULL,
    url character varying(500),
    PRIMARY KEY (id_municipio_rede_social)
);