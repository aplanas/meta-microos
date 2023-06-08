SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python310-itemloaders-1.0.6-1.3.noarch.rpm"
RPM_HASH = "cd82e0b8a9884c0c3963ef66ff3022b6907a7b77028170224caa5e59f3115680bd229d632e25e35056e7eaa74fdf4d8d6ee01c70b670d03139af7463c73b8efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itemloaders python3.10dist(itemloaders) python310-itemloaders python3dist(itemloaders)"
RDEPENDS:${PN} += "python(abi) python310-itemadapter python310-jmespath python310-parsel python310-w3lib"

inherit rpm
