SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-deepmerge-0.1.0-1.12.noarch.rpm"
RPM_HASH = "388a33abd1220513bb031d3cf570e88301e72082b996aa0b15302f1ce8409b7c51413915ff0c6bc8e5e0a6ebf40e0361095c89a8952a3590240668f6b9315229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepmerge python3.10dist(deepmerge) python310-deepmerge python3dist(deepmerge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
