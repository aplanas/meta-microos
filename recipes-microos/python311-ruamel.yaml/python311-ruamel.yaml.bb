SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.21"

RPM_NAME = "python311-ruamel.yaml-0.17.21-2.1.noarch.rpm"
RPM_HASH = "e3b079b8957962f1559c443f8767e1e182e6cbd929bae0c8af2988c9fb29703369f294812c0ba80d47d73e1f8bf9b418066d6b9845c61508506f7128a759c2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ruamel.yaml) python311-ruamel.yaml python3dist(ruamel.yaml)"
RDEPENDS:${PN} += "python(abi) python311-ruamel.yaml.clib"

inherit rpm
