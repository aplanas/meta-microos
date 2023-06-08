SUMMARY = "Compile-time Dependency Injection for Go"
DESCRIPTION = "Wire is a code generation tool that automates connecting components using \
dependency injection. Dependencies between components are represented in Wire \
as function parameters, encouraging explicit initialization instead of global \
variables. Because Wire operates without runtime state or reflection, code \
written to be used with Wire is useful even for hand-written initialization."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "wire-0.5.0-10.1.aarch64.rpm"
RPM_HASH = "f4d7a7552e6652313906001e15834fe1d2059706f2b9947557bf7552f2a5239663202da6af3c8dfac64a14dc0070b33505f713451796b69b830e4d001d1b37c3"

RPROVIDES:${PN} += "wire wire(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
