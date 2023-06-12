SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python311-atpublic-3.1.1-2.2.noarch.rpm"
RPM_HASH = "36dc3b3b467cbcebcc4ea16e268cc4a23ef73a6e0ab325ebddfd356e85f8e6b3742d6b24f696a85f88f055159b7a8e7a8764c891d159051bb6e285486c000f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(atpublic) \
python311-atpublic \
python3dist(atpublic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
