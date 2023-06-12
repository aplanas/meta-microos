SUMMARY = "Jsonnet implementation in pure Go"
DESCRIPTION = "Feature complete, production-ready implementation of Jsonnet. It is compatible with the original \
Jsonnet C++ implementation."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "golang-github-google-jsonnet-0.20.0-1.1.aarch64.rpm"
RPM_HASH = "a0fe6f195f61ab42d9fb476766ca752c71c36b30871dacf7dd6cf95351e33a207b4958ac4b99f27affd039c7e6640ad9ad982d984e6d0da40ef605e9ed65bb80"

RPROVIDES:${PN} += "golang-github-google-jsonnet \
golang-github-google-jsonnet(aarch-64) \
jsonnet"
RDEPENDS:${PN} += ""

inherit rpm
