SUMMARY = "Extension to the parse module"
DESCRIPTION = "parse_type extends the parse module (opposite of string.format()) with \
the following features: \
 \
  * build type converters for common use cases (enum/mapping, choice) \
  * build a type converter with a cardinality constraint (0..1, 0..*, 1..*) \
    from the type converter with cardinality=1. \
  * compose a type converter from other type converters \
  * an extended parser that supports the CardinalityField naming schema \
    and creates missing type variants (0..1, 0..*, 1..*) from the \
    primary type converter"
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-parse_type-0.6.0-1.7.noarch.rpm"
RPM_HASH = "2ef47000ef20749448ffa62d973bfa2bf4c49bfd8d10a37cf7a2cc2be625f441aaf9b03d8adde8ae8ff64d00ec07fd05a7f5932c6c3926b902cd5565437f27f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parse-type) python39-parse_type python3dist(parse-type)"
RDEPENDS:${PN} += "python(abi) python39-parse python39-six"

inherit rpm
