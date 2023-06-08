SUMMARY = "HTML5 client for Xpra"
DESCRIPTION = "This is the HTML5 client for Xpra, \
which can be made available for browsers by the xpra server \
or by any other web server."
LICENSE = "GPL-2.0+ & BSD-3-Clause & LGPL-3.0+ & MIT"

PV = "7.0+git20221227.017148e"

RPM_NAME = "xpra-html5-7.0+git20221227.017148e-1.2.noarch.rpm"
RPM_HASH = "e3852c2b886caa39c0f9493cbe2a7c339f8374a08c7dcbac3e49c184fa27308c614b240ccf5bee3f5c2c9d437455134870c2133de2bf9dcf7c48b431d4b1d55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bundled(js-aurora) bundled(js-bencode) bundled(js-broadway) bundled(js-forge) bundled(js-jquery) bundled(js-jquery-ui) bundled(js-lz4) bundled(js-zlib) config(xpra-html5) xpra-html5"
RDEPENDS:${PN} += "cups-client dejavu-fonts python3-avahi python3-netifaces python3-paramiko python3-pyinotify python3-pyxdg python3-websockify python3-zeroconf qrencode xpra"

inherit rpm
