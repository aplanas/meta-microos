SUMMARY = "A text-to-intent parsing framework"
DESCRIPTION = "The Adapt Intent Parser is a flexible and extensible intent definition and \
determination framework. It is intended to parse natural language text into \
a structured intent that can then be invoked programatically."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-adapt-parser-1.0.0-2.3.noarch.rpm"
RPM_HASH = "ad54d0be0c6bde1d0c96df06d114e690de276eb0491e0f6e6bc37713b0fad56e6549fe6adbe9b1949be4e8b739a88fdfce79286ab1a8355cb7517dc78317d79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-adapt-parser \
python3.10dist(adapt-parser) \
python310-adapt-parser \
python3dist(adapt-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
