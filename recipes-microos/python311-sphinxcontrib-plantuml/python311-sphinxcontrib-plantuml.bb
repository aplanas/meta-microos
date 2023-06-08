SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python311-sphinxcontrib-plantuml-0.24.1-1.3.noarch.rpm"
RPM_HASH = "e5dd53384d59b880ecad28e95925afc546af2b47dce05b6fe254cb13dcbdddf0b68bd4abc781e7a99b5c507914dc341757ef4bb6eb484440596037a25eadc1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-plantuml) python311-sphinxcontrib-plantuml python3dist(sphinxcontrib-plantuml)"
RDEPENDS:${PN} += "plantuml python(abi) python311-Sphinx"

inherit rpm
