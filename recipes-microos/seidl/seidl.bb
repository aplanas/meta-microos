SUMMARY = "Complementary light pint client"
DESCRIPTION = "seidl is a lightweight pint query utility designed for easy usage. It displays the current SUSE publiccloud images according to customizable filter rules. \
 \
In aims at complementing the public-cloud-info-client by the feature to display all current not-deleted and not-deprecated images in a nice table on the console."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "seidl-0.1-1.6.aarch64.rpm"
RPM_HASH = "37eb57f122754f930826fa2537dbbc8c7ae55341fb8108506c3fd22344d5d21aada962b9d0d63d02abc7d0a0f7d378252dbf3d437440bbac83e640219cef36d3"

RPROVIDES:${PN} += "seidl seidl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
