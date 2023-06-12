SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python311-musicbrainzngs-0.7.1-2.6.noarch.rpm"
RPM_HASH = "e613f8f38c68f0045cd9797e4e9ec91b1560b4348b6fc27cf83e3912d486de8c73996168239724f6764655e6d7a391024d5cebd21aea892f1e9562fdca29ff5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(musicbrainzngs) \
python311-musicbrainzngs \
python3dist(musicbrainzngs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
