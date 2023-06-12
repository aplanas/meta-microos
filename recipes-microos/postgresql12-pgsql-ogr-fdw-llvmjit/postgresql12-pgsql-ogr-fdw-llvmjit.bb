SUMMARY = "Just-in-time compilation support for PostgreSQL pgsql-ogr-fdw extension"
DESCRIPTION = "This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "postgresql12-pgsql-ogr-fdw-llvmjit-1.1.0-4.2.aarch64.rpm"
RPM_HASH = "bf06c5354aca810e4aab3f7a674a06971d3cbe081a2b5e06873c8e1d5dcb7269077703ea0ba7cf4394a16ecef20ef72e1c4bad627654fe3ca761e5f7f9834327"

RPROVIDES:${PN} += "postgresql12-pgsql-ogr-fdw-llvmjit postgresql12-pgsql-ogr-fdw-llvmjit(aarch-64)"
RDEPENDS:${PN} += "postgresql12-llvmjit postgresql12-pgsql-ogr-fdw postgresql12-server"

inherit rpm
