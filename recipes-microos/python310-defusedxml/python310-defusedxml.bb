SUMMARY = "XML bomb protection for Python stdlib modules"
DESCRIPTION = "The results of an attack on a vulnerable XML library can be fairly dramatic. \
With just a few hundred bytes of XML data an attacker can occupy several \
gigabytes of memory within seconds. An attacker can also keep \
CPUs busy for a long time with a small to medium size request. \
 \
This library allows for XML to be parsed in a manner that avoids these \
pitfalls."
LICENSE = "Python-2.0"

PV = "0.7.1"

RPM_NAME = "python310-defusedxml-0.7.1-3.1.noarch.rpm"
RPM_HASH = "fd7012a9c218c8f544ab08f60410ec0c3756644d0bc06470da84ccc0d827fe23362d32e21db66a202bc8417721a54aa417e22e4478cc7b23348cd26dfc521ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defusedxml python3.10dist(defusedxml) python310-defusedxml python3dist(defusedxml)"
RDEPENDS:${PN} += "python(abi) python310-xml"

inherit rpm
