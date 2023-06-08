SUMMARY = "Development package for xmlrpc-c"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of xmlrpc-c."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.54.06"

RPM_NAME = "xmlrpc-c-devel-1.54.06-1.3.aarch64.rpm"
RPM_HASH = "e677b569d671955ab96522e6e0b637a635bf67f1f2f31b3115452e6e23e57587069e6dce90348d27f36db5357e1135580629f0eb3ff1cbf8d1e0ae54378a8b9f"

RPROVIDES:${PN} += "pkgconfig(xmlrpc) pkgconfig(xmlrpc++) pkgconfig(xmlrpc_abyss) pkgconfig(xmlrpc_abyss++) pkgconfig(xmlrpc_client) pkgconfig(xmlrpc_client++) pkgconfig(xmlrpc_server) pkgconfig(xmlrpc_server++) pkgconfig(xmlrpc_server_abyss) pkgconfig(xmlrpc_server_cgi) pkgconfig(xmlrpc_server_pstream++) pkgconfig(xmlrpc_util) pkgconfig(xmlrpc_util++) xmlrpc-c-devel xmlrpc-c-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libxmlrpc++8 libxmlrpc3 libxmlrpc_abyss++8 libxmlrpc_abyss3 libxmlrpc_client++8 libxmlrpc_client3 libxmlrpc_cpp8 libxmlrpc_packetsocket8 libxmlrpc_server++8 libxmlrpc_server3 libxmlrpc_server_abyss++8 libxmlrpc_server_abyss3 libxmlrpc_server_cgi++8 libxmlrpc_server_cgi3 libxmlrpc_server_pstream++8 libxmlrpc_util++8 libxmlrpc_util4 pkgconfig(libxml-2.0) pkgconfig(xmlrpc) pkgconfig(xmlrpc++) pkgconfig(xmlrpc_abyss) pkgconfig(xmlrpc_client) pkgconfig(xmlrpc_server) pkgconfig(xmlrpc_server++) pkgconfig(xmlrpc_util) pkgconfig(xmlrpc_util++)"

inherit rpm
