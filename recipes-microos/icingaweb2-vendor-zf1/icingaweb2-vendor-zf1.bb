SUMMARY = "Icinga Web 2's fork of Zend Framework 1"
DESCRIPTION = "Icinga Web 2's fork of Zend Framework 1."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-zf1-2.11.4-1.1.noarch.rpm"
RPM_HASH = "caeae8bf015fe9c6c98bda59b4d0240cec772fad03d17c79fe4a843d92cb000a3ddba9e307f3488149201b5e7a3669102772d5124cd38f45298ff15b5155727f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Zend icingaweb2-vendor-zf1"
RDEPENDS:${PN} += "icingaweb2-common php"

inherit rpm
