SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-asdf-transform-schemas-0.3.0-1.3.noarch.rpm"
RPM_HASH = "fb10f9561bb0b44044526056a5ad04211e99c78b7401e2b79a4ca80844a9834bc54cc4cd41dd39d6918223a9328255114bc62f463d357f6a7a8de49b8ac8be27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-transform-schemas \
python3-asdf_transform_schemas \
python3.10dist(asdf-transform-schemas) \
python310-asdf-transform-schemas \
python310-asdf_transform_schemas \
python3dist(asdf-transform-schemas)"
RDEPENDS:${PN} += "python(abi) \
python310-asdf-standard"

inherit rpm
