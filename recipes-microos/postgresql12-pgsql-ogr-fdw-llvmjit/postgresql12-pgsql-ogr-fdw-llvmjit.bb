SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-llvmjit-1.1.0-4.1.aarch64.rpm"
RPM_HASH = "5ce9fa98913139dc1458bdb505a4bbde541284f48e4c0331c2ec81bc7398205dc410a73c0e88256490560eeec62075260b32c3a89308d20939a77acc93d14c31"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw-llvmjit postgresql12-pgsql-ogr-fdw-llvmjit(aarch-64)"
RDEPENDS:${PN} += "postgresql12-llvmjit postgresql12-pgsql-ogr-fdw postgresql12-server"

inherit rpm
