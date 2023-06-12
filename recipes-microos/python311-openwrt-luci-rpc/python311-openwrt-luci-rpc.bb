SUMMARY = "Module for interacting with OpenWrt Luci RPC interface"
DESCRIPTION = "Module for interacting with OpenWrt Luci RPC interface. You need to have 'luci-mod-rpc' \
installed on your openwrt based router. \
 \
-  Allows you to use the Luci RPC interface to fetch connected devices \
   on your OpenWrt based router. \
-  Supports 15.X & 17.X & 18.X or newer releases of OpenWrt. \
 \
https://openwrt-luci-rpc.readthedocs.io"
LICENSE = "Apache-2.0"

PV = "1.1.12"

RPM_NAME = "python311-openwrt-luci-rpc-1.1.12-2.2.noarch.rpm"
RPM_HASH = "343cfc07ec19a5141d2a95849fb95eb7be72e636b3312be4ca72cfce12b84971582520e5702b9f2612d034548b61491850e050908470577b3e70910b87a7affb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openwrt-luci-rpc) \
python311-openwrt-luci-rpc \
python3dist(openwrt-luci-rpc)"
RDEPENDS:${PN} += "python(abi) \
python311-click \
python311-packaging \
python311-requests"

inherit rpm
