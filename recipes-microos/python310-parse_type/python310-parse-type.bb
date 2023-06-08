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

RPM_NAME = "python310-parse_type-0.6.0-1.7.noarch.rpm"
RPM_HASH = "6b2241f6da56ff1f4f2134c5771a44bc1c89d36f22f6c688e4b56a2167fee940ad314bec9f410dd559043ec440312e94c7a77f05b490e05fedc68121963ee137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse_type python3.10dist(parse-type) python310-parse_type python3dist(parse-type)"
RDEPENDS:${PN} += "python(abi) python310-parse python310-six"

inherit rpm
