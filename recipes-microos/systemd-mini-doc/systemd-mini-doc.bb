SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-mini-doc-253.4-1.1.aarch64.rpm"
RPM_HASH = "245ff36f09d0e3cbde7508bca412aaa46036e4cc9c4b777753bb000ad82473a1eb5aebd1166fc3489e46720f26893d83286d3488cf219cc31c9ffa591bf4aa09"

RPROVIDES:${PN} += "systemd-mini-doc systemd-mini-doc(aarch-64)"
RDEPENDS:${PN} += "this-is-only-for-build-envs"

inherit rpm
