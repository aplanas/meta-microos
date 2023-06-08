SUMMARY = "XEmacs Packages"
DESCRIPTION = "A collection of additional lisp packages for XEmacs. You must install \
this package when you want to use the XEmacs package, they are needed \
for most non-trivial XEmacs functions. \
 \
 \
 \
Authors: \
-------- \
    Chuck Thompson   <cthomp@cs.uiuc.edu> \
    Ben Wing <wing@666.com> \
    and many other contributors"
LICENSE = "GPL-3.0-or-later"

PV = "20130822"

RPM_NAME = "xemacs-packages-20130822-12.6.noarch.rpm"
RPM_HASH = "0e7f5482ece130acebd37144d83b0e96648c1c99aacf67927510188d0c854f571db5ea2de5de7d9ecedac191ae247c256967dd5d5a6e71f2ecfeb2b1012d99d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xemacs-packages) xemacs-packages xemacs:/usr/share/xemacs/xemacs-packages/etc/auctex/style/amsart.elc"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/perl"

inherit rpm
