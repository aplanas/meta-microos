SUMMARY = "A tool for automatically generating markdown documentation for helm charts"
DESCRIPTION = "The helm-docs tool auto-generates documentation from helm charts into markdown files. The resulting files contain metadata about their respective chart and a table with each of the chart's values, their defaults, and an optional description parsed from comments. \
 \
The markdown generation is entirely gotemplate driven. The tool parses metadata from charts and generates a number of sub-templates that can be referenced in a template file (by default README.md.gotmpl). If no template file is provided, the tool has a default internal template that will generate a reasonably formatted README."
LICENSE = "GPL-3.0-only"

PV = "1.11.0"

RPM_NAME = "helm-docs-1.11.0-1.5.aarch64.rpm"
RPM_HASH = "c7e808c09cc3010838e0d5d1a7bcc263cb8515c06f02622a6e3064a1d1e8e0d6c6e18fd3c187492a1e897b07e1aec6eb50d50ae06f8f4096fb26c1adf021fe49"

RPROVIDES:${PN} += "helm-docs helm-docs(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
