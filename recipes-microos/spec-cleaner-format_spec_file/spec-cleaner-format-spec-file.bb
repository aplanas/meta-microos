SUMMARY = "Binding replacing OBS service format_spec_file"
DESCRIPTION = "Alternative provider of format_spec_file functionality in order to allow \
user to use spec-cleaner rather than to stick to perl based format_spec_file."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "spec-cleaner-format_spec_file-1.2.1-3.8.noarch.rpm"
RPM_HASH = "8d49a778af6d8270a9cc023c15ee68839124fa2c7aa689dc8013f5dc6c06c6c14f1f596c372e74e4e4e0aeeaa5cce99b448363de04a390c29d57e32ed635b68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-cleaner-format_spec_file"
RDEPENDS:${PN} += "/bin/sh spec-cleaner"

inherit rpm
