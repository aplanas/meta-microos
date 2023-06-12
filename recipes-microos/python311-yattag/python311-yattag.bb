SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python311-yattag-1.15.1-1.1.noarch.rpm"
RPM_HASH = "f80773f2400cbd4c89782b7eaed0d402a25e005e45adcb17760b25f45078bf3ae3b62887a4eea5db3d8a8a298192b744103f835ad285d511054aced10fd48d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yattag) \
python311-yattag \
python3dist(yattag)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
