SUMMARY = "Tools to work with documents in Corel Draw file format"
DESCRIPTION = "Tools to work with documents in Corel Draw file format."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-tools-0.1.7-1.17.aarch64.rpm"
RPM_HASH = "70be1bc2e927c9bd71ca08945664654d63fdbad2824febd7a2846984cf40ced9c377d72389957cd67724fada52b235728660640daaa6d696e5f2f3f384bdc57f"

RPROVIDES:${PN} += "libcdr-tools libcdr-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcdr-0.1.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
