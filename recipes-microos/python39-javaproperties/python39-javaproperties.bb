SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-javaproperties-0.8.1-1.1.noarch.rpm"
RPM_HASH = "04da260a2c52ffac4cc90d340b01c96450dca81f24e82d7a15d7bc7a1ded872f4ed5f5c7d5ee23daab1e345ee3715c634788348a13b425985e763c109daa4ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(javaproperties) \
python39-javaproperties \
python3dist(javaproperties)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
