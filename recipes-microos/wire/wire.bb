SUMMARY = "Compile-time Dependency Injection for Go"
DESCRIPTION = "Wire is a code generation tool that automates connecting components using \
dependency injection. Dependencies between components are represented in Wire \
as function parameters, encouraging explicit initialization instead of global \
variables. Because Wire operates without runtime state or reflection, code \
written to be used with Wire is useful even for hand-written initialization."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "wire-0.5.0-10.2.aarch64.rpm"
RPM_HASH = "e9f04131b32c371445edee3f5dee1505f208bd4a6e7e280e6ac40c5cfc4bef27469f269d7407a0113a5df5f6f1ee3f1168767f3a2ea0d7db0929a18f22e620a8"

RPROVIDES:${PN} += "wire wire(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
