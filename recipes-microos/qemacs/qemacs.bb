SUMMARY = "An editor similar to Emacs"
DESCRIPTION = "Full screen editor with an Emacs look and feel with common Emacs features \
like multi-buffer, multi-window, command mode, universal argument, \
keyboard macros, config file with C like syntax, minibuffer with \
completion and history. Additional features: \
 \
* UTF-8 support, including bidirectional editing respecting the \
  Unicode bidi algorithm. \
 \
* WYSIWYG HTML/XML/CSS2 mode graphical editing. Supports Lynx-like \
  rendering on VT100 terminals. \
 \
* A WYSIWYG DocBook mode based on XML/CSS2 renderer. \
 \
* C mode: coloring with immediate update. Emacs like auto-indent. \
 \
* Shell mode: colorized VT100 emulation so that shells work as \
  expected. Compile mode with next/prev error. \
 \
* Input methods for most languages, including Chinese (input methods \
  come from the Yudit editor). \
 \
* Hexadecimal editing mode with insertion and block commands. Unicode \
  hexa editing of UTF-8 files also supported. \
 \
* X11 support and support for multiple proportional fonts at the same \
  time (as XEmacs). X Input methods supported. Xft extension \
  supported for anti aliased font display."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.3"

RPM_NAME = "qemacs-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "a60ef89e0d07b7d76f1bf5e1d6158c1ffe6f766c0f583d5885204f8512450aa6e00b24c0098f03c014f6e787f6144ffb59ac06f352ce897aaf713c11a850c8b2"

RPROVIDES:${PN} += "qemacs qemacs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXv.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
