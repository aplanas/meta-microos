SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python311-Jinja2-3.1.2-3.1.aarch64.rpm"
RPM_HASH = "5f6f32a118925a2a31b9865e49a8eda69867e9a5d0b1f92756712d62eca79e18cd940e361d0fcb3682acfb35b6d08ad865ef5f42f1d6d560d2e359424732ea69"

RPROVIDES:${PN} += "python3.11dist(jinja2) python311-Jinja2 python311-Jinja2(aarch-64) python311-jinja2 python3dist(jinja2)"
RDEPENDS:${PN} += "python(abi) python311-MarkupSafe"

inherit rpm
