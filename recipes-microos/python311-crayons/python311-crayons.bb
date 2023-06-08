SUMMARY = "Colored strings for terminal usage"
DESCRIPTION = "Crayons is a simple module to give you colored strings for terminal usage. \
Included colors are red, green, yellow, blue, black, magenta, cyan, white, \
and normal."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-crayons-0.4.0-3.8.noarch.rpm"
RPM_HASH = "258614f837d664216c3eecd6234d02c496c4e1461d27d15bfef755516d8d35c75028ff11deab4aae5290b8646cdc07a280b594bd4800b76661211b78e9636237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(crayons) python311-crayons python3dist(crayons)"
RDEPENDS:${PN} += "python(abi) python311-colorama"

inherit rpm
