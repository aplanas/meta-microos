SUMMARY = "OCaml runtime environment"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains the runtime environment needed to run OCaml \
bytecode."
LICENSE = "QPL-1.0"

PV = "4.14.1"

RPM_NAME = "ocaml-runtime-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "289f4da27c5dacc46a9c18fe43e3f3449c1955aa57f90c9de138f741f091af96281bcd85f8a1c30707b68c88b5ce68c836fcefb5dc08869c7ea192cd0fbe703f"

RPROVIDES:${PN} += "ocaml(Bigarray) \
ocaml(CamlinternalAtomic) \
ocaml(CamlinternalFormat) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalMod) \
ocaml(CamlinternalOO) \
ocaml(Condition) \
ocaml(Dynlink) \
ocaml(Dynlink_common) \
ocaml(Dynlink_compilerlibs) \
ocaml(Dynlink_platform_intf) \
ocaml(Dynlink_types) \
ocaml(Event) \
ocaml(Mutex) \
ocaml(Profiling) \
ocaml(Semaphore) \
ocaml(Std_exit) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__ArrayLabels) \
ocaml(Stdlib__Atomic) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Bool) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__BytesLabels) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Ephemeron) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Float) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Fun) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__Genlex) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__In_channel) \
ocaml(Stdlib__Int) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__ListLabels) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__MoreLabels) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Oo) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Out_channel) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Pervasives) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Result) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__StdLabels) \
ocaml(Stdlib__Stream) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdlib__Unit) \
ocaml(Stdlib__Weak) \
ocaml(Str) \
ocaml(Thread) \
ocaml(ThreadUnix) \
ocaml(Unix) \
ocaml(UnixLabels) \
ocaml(runtime) \
ocaml-runtime \
ocaml-runtime(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
