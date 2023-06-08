SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python310-PyTweening-1.0.4-1.3.noarch.rpm"
RPM_HASH = "a8971ea01f11c2be2a3fcda6cbe3c143fa76c59985da2fe37192e1c4c33d574eb272024303259c164b23bedd50f70b2fb20b383c4f38ce1709606b145a173939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTweening python3.10dist(pytweening) python310-PyTweening python3dist(pytweening)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
