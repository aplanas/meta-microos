SUMMARY = "Base library for scrapy's ItemLoader"
DESCRIPTION = "Library to populate items using XPath and CSS with a convenient API"
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python39-itemloaders-1.0.6-1.3.noarch.rpm"
RPM_HASH = "0f444d4c16e569c16d8667cb4ee1e1471420004458e1d90ebc420cac69c505dd9e96e6ba0982a08b7ac61f91854d84b562849bcf702b394646ee4ce9933bda38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(itemloaders) python39-itemloaders python3dist(itemloaders)"
RDEPENDS:${PN} += "python(abi) python39-itemadapter python39-jmespath python39-parsel python39-w3lib"

inherit rpm
