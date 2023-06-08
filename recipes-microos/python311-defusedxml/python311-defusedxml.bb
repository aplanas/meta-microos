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

RPM_NAME = "python311-defusedxml-0.7.1-3.1.noarch.rpm"
RPM_HASH = "a8081d77bd166e9c3c45cc7e20d14dabb0b06672e51fe2372dd78bb0efe199440416779b20c845aace7688ec6de6a0fd96bd720a390928af146c1b537be22eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(defusedxml) python311-defusedxml python3dist(defusedxml)"
RDEPENDS:${PN} += "python(abi) python311-xml"

inherit rpm
