SUMMARY = "Python library for parsing Java properties"
DESCRIPTION = "A python library for parsing Java properties files."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-pyjavaproperties-0.7-2.15.noarch.rpm"
RPM_HASH = "7d6b98ad3ae147278caf2fb018dcbd8a1ac08fa8f2cb09019e34bda6048938b8cf722fe1b34fcba5285d93aa148e517e31ceb2848a5a66f46a7559499095e71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjavaproperties python3.10dist(pyjavaproperties) python310-pyjavaproperties python3dist(pyjavaproperties)"
RDEPENDS:${PN} += "python(abi) python310-base"

inherit rpm
