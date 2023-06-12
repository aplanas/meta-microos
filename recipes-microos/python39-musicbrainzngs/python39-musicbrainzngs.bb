SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python39-musicbrainzngs-0.7.1-2.6.noarch.rpm"
RPM_HASH = "5bbf03ec979cdaca713b3a331d7e1f88902eedafacb8884660fee57d8da52b2d3da59d86e16211564bf71cc4831bdf1ad192a2738f19ddb89dcc75f4310d51e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(musicbrainzngs) \
python39-musicbrainzngs \
python3dist(musicbrainzngs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
