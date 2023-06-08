SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55933"

RPM_NAME = "texlive-spix-bin-2023.20230311.svn55933-89.1.aarch64.rpm"
RPM_HASH = "536cd33f6a470d1696ee883904eba57f8d00a6d41c296f0a1b2c8a14647e26f81d385f5eb6c9d75c7adecf82df358ed62db2047d2a6647fd900534a154bea030"

RPROVIDES:${PN} += "texlive-spix-bin texlive-spix-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-spix"

inherit rpm
