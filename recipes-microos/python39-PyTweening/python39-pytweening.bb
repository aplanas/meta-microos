SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python39-PyTweening-1.0.4-1.3.noarch.rpm"
RPM_HASH = "eefdb89224cbad6df2be0c7d1aa1f5c0c2969295c6d0c43710c8e31b7c3630465ea7ea5ab177b413fded24d1271130dc268ce33249c7650a9f81f1b5399a0059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytweening) \
python39-PyTweening \
python3dist(pytweening)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
