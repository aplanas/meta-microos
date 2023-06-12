SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python311-fissix-21.11.13-1.15.noarch.rpm"
RPM_HASH = "288bf96b1d351b1c86941870472c6c523ae4fbca21c91be78524c742a1583325d348c83b568ae12bfbbbdd8cfd7d20f4f1e85f9fcc94ac3d59f8553a9b937bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fissix) \
python311-fissix \
python3dist(fissix)"
RDEPENDS:${PN} += "python(abi) \
python311-appdirs"

inherit rpm
