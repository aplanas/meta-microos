SUMMARY = "Pager for JSON (or YAML) data"
DESCRIPTION = "JLess is a command-line JSON viewer designed for reading, exploring, and \
searching through JSON data. \
 \
JLess will pretty print your JSON and apply syntax highlighting. Use it when \
exploring external APIs, or debugging request payloads. \
 \
Expand and collapse Objects and Arrays to grasp the high- and low-level \
structure of a JSON document. JLess has a large suite of vim-inspired commands \
that make exploring data a breeze. \
 \
JLess supports full text regular-expression based search. Quickly find the data \
you're looking for in long String values, or jump between values for the same \
Object key."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "jless-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "d529147cbad6937aa6725851790d56b1455bc9d6055d9116966195b0863fae2bb017934367c7fbbfdce5e7aa631ee47b4ee9688df9d321bfe1150da93792e6be"

RPROVIDES:${PN} += "jless jless(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libxcb-render.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
