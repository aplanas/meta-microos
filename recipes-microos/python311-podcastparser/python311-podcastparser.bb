SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python311-podcastparser-0.6.9-1.3.noarch.rpm"
RPM_HASH = "b5a3e93a31da9067f9b3ae2542ed5433e9b6e1b9e2d7989d24cfaafc8afa0ce1decc50ad3a518cb7a5555caadcc16db501fbd7c8d7e07e6cac2c282c7fd02987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(podcastparser) \
python311-podcastparser \
python3dist(podcastparser)"
RDEPENDS:${PN} += "python(abi) \
python311-xml"

inherit rpm
