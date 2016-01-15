module control(clock, reset, numberofv,memArray ,startAddress1, startAddress2,1R1W_WE,2R1W_WE,FE);

input clock,reset;

input[7:0] numberofv;


output 1R1W_WE,2R1W_WE,FE;

reg 1R1W_WE, 2R1W_WE,FE;

reg[12:0] startAddress1;



parameter [1:0] S0 = 2'b00, S1 = 2'b01, S2 = 2'b10, IDEL = 2'b11;


always@(posedge clock or posedge reset)
begin
if(reset) 
begin
state<=IDEL;
end

else
begin
state<=next_state;
end


always@(*)
casex(state)

IDEL: begin
      1R1W_WE =0;
      2R1W_WE =0;
      end

S0:   begin 
      FE=1;
      startAddress = 0;
      2R1W_WE = 1;
      state = next_state;
      end
      
S1:  begin
     startAddress = startAddress+1'b1;
     memArray = {FFFF,0};

S2:  begin
     if(  






      
    