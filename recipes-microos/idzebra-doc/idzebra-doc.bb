SUMMARY = "Documentation for the idzebra Package"
DESCRIPTION = "This package contains the documentation for Zebra.  Zebra is a fielded \
free text indexing and retrieval engine with a Z39.50 front-end."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "idzebra-doc-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "87a7622148db5151f9aba90e13fadea3a583e2fe80c187ff3feecfc46eb500eaf1869e78daea54cbce3858843794a3228695a123554af17333765efbd10b19d5"

RPROVIDES:${PN} += "idzebra-doc idzebra-doc(aarch-64)"
RDEPENDS:${PN} += "idzebra"

inherit rpm
