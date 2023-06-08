SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python310-schema-0.7.5-2.3.noarch.rpm"
RPM_HASH = "d806d4462c24a092e9f6dc807e527cb75268fa01be031fd45237153db5b6bdcbffab0c84c2e1eee8baa6627a474842fd5dbb59ce504d892f939242d8bbe169b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schema python3.10dist(schema) python310-schema python3dist(schema)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
