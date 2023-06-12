SUMMARY = "Shell bindings for subunit"
DESCRIPTION = "Subunit shell bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-shell-1.4.2-2.2.noarch.rpm"
RPM_HASH = "a064e42cc5f9005f5cfa47188cee57b932aabcc438461716c538b52dfa19978201b9938c1adb759be4964e80d3365239cf9f10304477182a29f35679ad8e5ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(subunit-shell) \
subunit-shell"
RDEPENDS:${PN} += ""

inherit rpm
