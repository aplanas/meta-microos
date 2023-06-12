SUMMARY = "Libraries used internal to the OCaml Compiler"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains libraries and signature files for developing \
applications that use Ocaml."
LICENSE = "QPL-1.0"

PV = "4.14.1"

RPM_NAME = "ocaml-compiler-libs-devel-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "c5c87d5b5294eafdfa1ce8739384aa25136908c5f2b2b692ecae8e640b2e3f1cd77868b0c89eab578ded289a5676d15c5045dfdb8ad139b93d40d14c8f28c911"

RPROVIDES:${PN} += "ocaml(Afl_instrument) \
ocaml(Alias_analysis) \
ocaml(Allocated_const) \
ocaml(Arch) \
ocaml(Arg_helper) \
ocaml(Asmgen) \
ocaml(Asmlibrarian) \
ocaml(Asmlink) \
ocaml(Asmpackager) \
ocaml(Ast_helper) \
ocaml(Ast_invariants) \
ocaml(Ast_iterator) \
ocaml(Ast_mapper) \
ocaml(Attr_helper) \
ocaml(Augment_specialised_args) \
ocaml(Backend_var) \
ocaml(Binutils) \
ocaml(Branch_relaxation) \
ocaml(Branch_relaxation_intf) \
ocaml(Btype) \
ocaml(Build_export_info) \
ocaml(Build_path_prefix_map) \
ocaml(Builtin_attributes) \
ocaml(Bytegen) \
ocaml(Bytelibrarian) \
ocaml(Bytelink) \
ocaml(Bytepackager) \
ocaml(Bytesections) \
ocaml(CSE) \
ocaml(CSEgen) \
ocaml(CamlinternalMenhirLib) \
ocaml(Ccomp) \
ocaml(Clambda) \
ocaml(Clambda_primitives) \
ocaml(Clflags) \
ocaml(Closure) \
ocaml(Closure_conversion) \
ocaml(Closure_conversion_aux) \
ocaml(Closure_element) \
ocaml(Closure_id) \
ocaml(Closure_middle_end) \
ocaml(Closure_offsets) \
ocaml(Closure_origin) \
ocaml(Cmi_format) \
ocaml(Cmm) \
ocaml(Cmm_helpers) \
ocaml(Cmm_invariants) \
ocaml(Cmmgen) \
ocaml(Cmmgen_state) \
ocaml(Cmt2annot) \
ocaml(Cmt_format) \
ocaml(Coloring) \
ocaml(Comballoc) \
ocaml(Compenv) \
ocaml(Compilation_unit) \
ocaml(Compile) \
ocaml(Compile_common) \
ocaml(Compilenv) \
ocaml(Compmisc) \
ocaml(Config) \
ocaml(Consistbl) \
ocaml(Convert_primitives) \
ocaml(Ctype) \
ocaml(Dataflow) \
ocaml(Datarepr) \
ocaml(Deadcode) \
ocaml(Debuginfo) \
ocaml(Depend) \
ocaml(Diffing) \
ocaml(Diffing_with_keys) \
ocaml(Dll) \
ocaml(Docstrings) \
ocaml(Domainstate) \
ocaml(Effect_analysis) \
ocaml(Emit) \
ocaml(Emitaux) \
ocaml(Emitcode) \
ocaml(Env) \
ocaml(Envaux) \
ocaml(Errors) \
ocaml(Errortrace) \
ocaml(Export_id) \
ocaml(Export_info) \
ocaml(Export_info_for_pack) \
ocaml(Extract_projections) \
ocaml(Find_recursive_functions) \
ocaml(Flambda) \
ocaml(Flambda_invariants) \
ocaml(Flambda_iterators) \
ocaml(Flambda_middle_end) \
ocaml(Flambda_to_clambda) \
ocaml(Flambda_utils) \
ocaml(Freshening) \
ocaml(Genprintval) \
ocaml(Id_types) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Import_approx) \
ocaml(Includeclass) \
ocaml(Includecore) \
ocaml(Includemod) \
ocaml(Includemod_errorprinter) \
ocaml(Inconstant_idents) \
ocaml(Initialize_symbol_to_let_symbol) \
ocaml(Inline_and_simplify) \
ocaml(Inline_and_simplify_aux) \
ocaml(Inlining_cost) \
ocaml(Inlining_decision) \
ocaml(Inlining_stats) \
ocaml(Inlining_stats_types) \
ocaml(Inlining_transforms) \
ocaml(Instruct) \
ocaml(Int_replace_polymorphic_compare) \
ocaml(Interf) \
ocaml(Internal_variable_names) \
ocaml(Interval) \
ocaml(Invariant_params) \
ocaml(Lambda) \
ocaml(Lazy_backtrack) \
ocaml(Lexer) \
ocaml(Lift_code) \
ocaml(Lift_constants) \
ocaml(Lift_let_to_initialize_symbol) \
ocaml(Linear) \
ocaml(Linear_format) \
ocaml(Linearize) \
ocaml(Linkage_name) \
ocaml(Linscan) \
ocaml(Liveness) \
ocaml(Load_path) \
ocaml(Local_store) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Mach) \
ocaml(Main) \
ocaml(Main_args) \
ocaml(Maindriver) \
ocaml(Makedepend) \
ocaml(Matching) \
ocaml(Meta) \
ocaml(Misc) \
ocaml(Mtype) \
ocaml(Mutable_variable) \
ocaml(Numbers) \
ocaml(Opcodes) \
ocaml(Oprint) \
ocaml(Optcompile) \
ocaml(Opterrors) \
ocaml(Optmain) \
ocaml(Optmaindriver) \
ocaml(Parameter) \
ocaml(Parmatch) \
ocaml(Parse) \
ocaml(Parser) \
ocaml(Pass_wrapper) \
ocaml(Path) \
ocaml(Patterns) \
ocaml(Persistent_env) \
ocaml(Polling) \
ocaml(Pparse) \
ocaml(Pprintast) \
ocaml(Predef) \
ocaml(Primitive) \
ocaml(Printast) \
ocaml(Printclambda) \
ocaml(Printclambda_primitives) \
ocaml(Printcmm) \
ocaml(Printinstr) \
ocaml(Printlambda) \
ocaml(Printlinear) \
ocaml(Printmach) \
ocaml(Printpat) \
ocaml(Printtyp) \
ocaml(Printtyped) \
ocaml(Proc) \
ocaml(Profile) \
ocaml(Projection) \
ocaml(Rec_check) \
ocaml(Ref_to_variables) \
ocaml(Reg) \
ocaml(Reload) \
ocaml(Reloadgen) \
ocaml(Remove_free_vars_equal_to_args) \
ocaml(Remove_unused_arguments) \
ocaml(Remove_unused_closure_vars) \
ocaml(Remove_unused_program_constructs) \
ocaml(Runtimedef) \
ocaml(Schedgen) \
ocaml(Scheduling) \
ocaml(Selectgen) \
ocaml(Selection) \
ocaml(Semantics_of_primitives) \
ocaml(Set_of_closures_id) \
ocaml(Set_of_closures_origin) \
ocaml(Shape) \
ocaml(Share_constants) \
ocaml(Signature_group) \
ocaml(Simple_value_approx) \
ocaml(Simplif) \
ocaml(Simplify_boxed_integer_ops) \
ocaml(Simplify_common) \
ocaml(Simplify_primitives) \
ocaml(Spill) \
ocaml(Split) \
ocaml(Static_exception) \
ocaml(Strmatch) \
ocaml(Strongly_connected_components) \
ocaml(Stypes) \
ocaml(Subst) \
ocaml(Switch) \
ocaml(Symbol) \
ocaml(Symtable) \
ocaml(Syntaxerr) \
ocaml(Tag) \
ocaml(Targetint) \
ocaml(Tast_iterator) \
ocaml(Tast_mapper) \
ocaml(Terminfo) \
ocaml(Tmc) \
ocaml(Topcommon) \
ocaml(Topdirs) \
ocaml(Topeval) \
ocaml(Tophooks) \
ocaml(Toploop) \
ocaml(Topmain) \
ocaml(Topstart) \
ocaml(Trace) \
ocaml(Translattribute) \
ocaml(Translclass) \
ocaml(Translcore) \
ocaml(Translmod) \
ocaml(Translobj) \
ocaml(Translprim) \
ocaml(Traverse_for_exported_symbols) \
ocaml(Type_immediacy) \
ocaml(Typeclass) \
ocaml(Typecore) \
ocaml(Typedecl) \
ocaml(Typedecl_immediacy) \
ocaml(Typedecl_properties) \
ocaml(Typedecl_separability) \
ocaml(Typedecl_unboxed) \
ocaml(Typedecl_variance) \
ocaml(Typedtree) \
ocaml(Typemod) \
ocaml(Typeopt) \
ocaml(Types) \
ocaml(Typetexp) \
ocaml(Un_anf) \
ocaml(Unbox_closures) \
ocaml(Unbox_free_vars_of_closures) \
ocaml(Unbox_specialised_args) \
ocaml(Untypeast) \
ocaml(Var_within_closure) \
ocaml(Variable) \
ocaml(Warnings) \
ocaml(X86_dsl) \
ocaml(X86_gas) \
ocaml(X86_masm) \
ocaml(X86_proc) \
ocaml-compiler-libs-devel \
ocaml-compiler-libs-devel(aarch-64) \
ocamlfind(compiler-libs) \
ocamlfind(compiler-libs.bytecomp) \
ocamlfind(compiler-libs.common) \
ocamlfind(compiler-libs.optcomp) \
ocamlfind(compiler-libs.toplevel) \
ocamlx(Afl_instrument) \
ocamlx(Alias_analysis) \
ocamlx(Allocated_const) \
ocamlx(Arch) \
ocamlx(Arg_helper) \
ocamlx(Asmgen) \
ocamlx(Asmlibrarian) \
ocamlx(Asmlink) \
ocamlx(Asmpackager) \
ocamlx(Ast_helper) \
ocamlx(Ast_invariants) \
ocamlx(Ast_iterator) \
ocamlx(Ast_mapper) \
ocamlx(Attr_helper) \
ocamlx(Augment_specialised_args) \
ocamlx(Backend_var) \
ocamlx(Binutils) \
ocamlx(Branch_relaxation) \
ocamlx(Branch_relaxation_intf) \
ocamlx(Btype) \
ocamlx(Build_export_info) \
ocamlx(Build_path_prefix_map) \
ocamlx(Builtin_attributes) \
ocamlx(Bytegen) \
ocamlx(Bytelibrarian) \
ocamlx(Bytelink) \
ocamlx(Bytepackager) \
ocamlx(Bytesections) \
ocamlx(CSE) \
ocamlx(CSEgen) \
ocamlx(CamlinternalMenhirLib) \
ocamlx(Ccomp) \
ocamlx(Clambda) \
ocamlx(Clambda_primitives) \
ocamlx(Clflags) \
ocamlx(Closure) \
ocamlx(Closure_conversion) \
ocamlx(Closure_conversion_aux) \
ocamlx(Closure_element) \
ocamlx(Closure_id) \
ocamlx(Closure_middle_end) \
ocamlx(Closure_offsets) \
ocamlx(Closure_origin) \
ocamlx(Cmi_format) \
ocamlx(Cmm) \
ocamlx(Cmm_helpers) \
ocamlx(Cmm_invariants) \
ocamlx(Cmmgen) \
ocamlx(Cmmgen_state) \
ocamlx(Cmt2annot) \
ocamlx(Cmt_format) \
ocamlx(Coloring) \
ocamlx(Comballoc) \
ocamlx(Compenv) \
ocamlx(Compilation_unit) \
ocamlx(Compile) \
ocamlx(Compile_common) \
ocamlx(Compilenv) \
ocamlx(Compmisc) \
ocamlx(Config) \
ocamlx(Consistbl) \
ocamlx(Convert_primitives) \
ocamlx(Ctype) \
ocamlx(Dataflow) \
ocamlx(Datarepr) \
ocamlx(Deadcode) \
ocamlx(Debuginfo) \
ocamlx(Depend) \
ocamlx(Diffing) \
ocamlx(Diffing_with_keys) \
ocamlx(Dll) \
ocamlx(Docstrings) \
ocamlx(Domainstate) \
ocamlx(Effect_analysis) \
ocamlx(Emit) \
ocamlx(Emitaux) \
ocamlx(Emitcode) \
ocamlx(Env) \
ocamlx(Envaux) \
ocamlx(Errors) \
ocamlx(Errortrace) \
ocamlx(Export_id) \
ocamlx(Export_info) \
ocamlx(Export_info_for_pack) \
ocamlx(Extract_projections) \
ocamlx(Find_recursive_functions) \
ocamlx(Flambda) \
ocamlx(Flambda_invariants) \
ocamlx(Flambda_iterators) \
ocamlx(Flambda_middle_end) \
ocamlx(Flambda_to_clambda) \
ocamlx(Flambda_utils) \
ocamlx(Freshening) \
ocamlx(Genprintval) \
ocamlx(Id_types) \
ocamlx(Ident) \
ocamlx(Identifiable) \
ocamlx(Import_approx) \
ocamlx(Includeclass) \
ocamlx(Includecore) \
ocamlx(Includemod) \
ocamlx(Includemod_errorprinter) \
ocamlx(Inconstant_idents) \
ocamlx(Initialize_symbol_to_let_symbol) \
ocamlx(Inline_and_simplify) \
ocamlx(Inline_and_simplify_aux) \
ocamlx(Inlining_cost) \
ocamlx(Inlining_decision) \
ocamlx(Inlining_stats) \
ocamlx(Inlining_stats_types) \
ocamlx(Inlining_transforms) \
ocamlx(Instruct) \
ocamlx(Int_replace_polymorphic_compare) \
ocamlx(Interf) \
ocamlx(Internal_variable_names) \
ocamlx(Interval) \
ocamlx(Invariant_params) \
ocamlx(Lambda) \
ocamlx(Lazy_backtrack) \
ocamlx(Lexer) \
ocamlx(Lift_code) \
ocamlx(Lift_constants) \
ocamlx(Lift_let_to_initialize_symbol) \
ocamlx(Linear) \
ocamlx(Linear_format) \
ocamlx(Linearize) \
ocamlx(Linkage_name) \
ocamlx(Linscan) \
ocamlx(Liveness) \
ocamlx(Load_path) \
ocamlx(Local_store) \
ocamlx(Location) \
ocamlx(Longident) \
ocamlx(Mach) \
ocamlx(Main) \
ocamlx(Main_args) \
ocamlx(Maindriver) \
ocamlx(Makedepend) \
ocamlx(Matching) \
ocamlx(Meta) \
ocamlx(Misc) \
ocamlx(Mtype) \
ocamlx(Mutable_variable) \
ocamlx(Numbers) \
ocamlx(Opcodes) \
ocamlx(Oprint) \
ocamlx(Optcompile) \
ocamlx(Opterrors) \
ocamlx(Optmain) \
ocamlx(Optmaindriver) \
ocamlx(Parameter) \
ocamlx(Parmatch) \
ocamlx(Parse) \
ocamlx(Parser) \
ocamlx(Pass_wrapper) \
ocamlx(Path) \
ocamlx(Patterns) \
ocamlx(Persistent_env) \
ocamlx(Polling) \
ocamlx(Pparse) \
ocamlx(Pprintast) \
ocamlx(Predef) \
ocamlx(Primitive) \
ocamlx(Printast) \
ocamlx(Printclambda) \
ocamlx(Printclambda_primitives) \
ocamlx(Printcmm) \
ocamlx(Printinstr) \
ocamlx(Printlambda) \
ocamlx(Printlinear) \
ocamlx(Printmach) \
ocamlx(Printpat) \
ocamlx(Printtyp) \
ocamlx(Printtyped) \
ocamlx(Proc) \
ocamlx(Profile) \
ocamlx(Projection) \
ocamlx(Rec_check) \
ocamlx(Ref_to_variables) \
ocamlx(Reg) \
ocamlx(Reload) \
ocamlx(Reloadgen) \
ocamlx(Remove_free_vars_equal_to_args) \
ocamlx(Remove_unused_arguments) \
ocamlx(Remove_unused_closure_vars) \
ocamlx(Remove_unused_program_constructs) \
ocamlx(Runtimedef) \
ocamlx(Schedgen) \
ocamlx(Scheduling) \
ocamlx(Selectgen) \
ocamlx(Selection) \
ocamlx(Semantics_of_primitives) \
ocamlx(Set_of_closures_id) \
ocamlx(Set_of_closures_origin) \
ocamlx(Shape) \
ocamlx(Share_constants) \
ocamlx(Signature_group) \
ocamlx(Simple_value_approx) \
ocamlx(Simplif) \
ocamlx(Simplify_boxed_integer_ops) \
ocamlx(Simplify_common) \
ocamlx(Simplify_primitives) \
ocamlx(Spill) \
ocamlx(Split) \
ocamlx(Static_exception) \
ocamlx(Strmatch) \
ocamlx(Strongly_connected_components) \
ocamlx(Stypes) \
ocamlx(Subst) \
ocamlx(Switch) \
ocamlx(Symbol) \
ocamlx(Symtable) \
ocamlx(Syntaxerr) \
ocamlx(Tag) \
ocamlx(Targetint) \
ocamlx(Tast_iterator) \
ocamlx(Tast_mapper) \
ocamlx(Terminfo) \
ocamlx(Tmc) \
ocamlx(Topcommon) \
ocamlx(Topdirs) \
ocamlx(Topeval) \
ocamlx(Tophooks) \
ocamlx(Toploop) \
ocamlx(Topmain) \
ocamlx(Topstart) \
ocamlx(Trace) \
ocamlx(Translattribute) \
ocamlx(Translclass) \
ocamlx(Translcore) \
ocamlx(Translmod) \
ocamlx(Translobj) \
ocamlx(Translprim) \
ocamlx(Traverse_for_exported_symbols) \
ocamlx(Type_immediacy) \
ocamlx(Typeclass) \
ocamlx(Typecore) \
ocamlx(Typedecl) \
ocamlx(Typedecl_immediacy) \
ocamlx(Typedecl_properties) \
ocamlx(Typedecl_separability) \
ocamlx(Typedecl_unboxed) \
ocamlx(Typedecl_variance) \
ocamlx(Typedtree) \
ocamlx(Typemod) \
ocamlx(Typeopt) \
ocamlx(Types) \
ocamlx(Typetexp) \
ocamlx(Un_anf) \
ocamlx(Unbox_closures) \
ocamlx(Unbox_free_vars_of_closures) \
ocamlx(Unbox_specialised_args) \
ocamlx(Untypeast) \
ocamlx(Var_within_closure) \
ocamlx(Variable) \
ocamlx(Warnings) \
ocamlx(X86_dsl) \
ocamlx(X86_gas) \
ocamlx(X86_masm) \
ocamlx(X86_proc)"
RDEPENDS:${PN} += "ocaml(Annot) \
ocaml(Asttypes) \
ocaml(Backend_intf) \
ocaml(CamlinternalFormat) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Cmo_format) \
ocaml(Cmx_format) \
ocaml(Cmxs_format) \
ocaml(Dynlink) \
ocaml(Emitenv) \
ocaml(Inlining_decision_intf) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Simplify_boxed_integer_ops_intf) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Float) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Fun) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Option) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Result) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(X86_ast) \
ocaml-compiler-libs \
ocamlx(CamlinternalFormat) \
ocamlx(CamlinternalLazy) \
ocamlx(CamlinternalOO) \
ocamlx(Dynlink) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Digest) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Float) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Fun) \
ocamlx(Stdlib__Gc) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__Nativeint) \
ocamlx(Stdlib__Obj) \
ocamlx(Stdlib__Option) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__Result) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__Seq) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__Stack) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__StringLabels) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Uchar)"

inherit rpm
