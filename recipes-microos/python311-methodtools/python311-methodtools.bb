SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python311-methodtools-0.4.2-1.12.noarch.rpm"
RPM_HASH = "093acd327b6c3fa59bb333ab513308822a1d4016469fa78deeb6634f2d178cb08825fe55671d100341950e42e702fc769675e5438fccd9ecef365770f3cdfbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(methodtools) python311-methodtools python3dist(methodtools)"
RDEPENDS:${PN} += "python(abi) python311-wirerope"

inherit rpm
